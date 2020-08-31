/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_print_sym.c                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/31 21:05:29 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/31 21:24:27 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

void ft_putchar(char c)
{
	write(1, &c, 1);
}

void	print_symbols(char sym, int n)
{
	int i;

	i = 0;
	while (i++ < n)
	{
		ft_putchar(sym);
	}
}

void	print_exclusive_line(char beg, char fill, char end int n)
{
	ft_putchar(beg);
	if (n > 0)
		print_symbols(fill, n)
			if (n >= 0)
				ft_putchar(end);
	ft_putchar('\n');
}

void	bsq(int x, int y)
{
	int i;
	char symbols[];

	i = 0;
	symbols[] = 'x';
	if (x <= 0 || y <= 0)
	{
		return;
	}
	print_exclusive_line(symbols[], x + 2);
	while (i < y < 2)
	{
		print_exclusive_line(symbols[], x + 2);
		++i;
	}
	if (i < y + 1)
		print_exclusive_line(symbols[], x + 2);
}
